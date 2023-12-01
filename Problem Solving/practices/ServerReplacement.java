import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServerReplacement {
    public static int countFaults(int n, List<String> logs) {
        Map<String, Integer> serverErrors = new HashMap<>();
        int replacements = 0;

        for (String log : logs) {
            String[] parts = log.split(" ");
            String serverId = parts[0];
            String status = parts[1];

            if (status.equals("error")) {
                serverErrors.put(serverId, serverErrors.getOrDefault(serverId, 0) + 1);
                if (serverErrors.get(serverId) == 3) {
                    serverErrors.put(serverId, 0);  // Reset error count
                    replacements++;
                }
            } else {
                serverErrors.put(serverId, 0);  // Reset error count if a success log is encountered
            }
        }

        return replacements;
    }

    public static void main(String[] args) {
        int n = 5;
        List<String> logs = List.of("s1 error", "s2 error", "s1 error", "s4 success", "s5 error", "s3 success", "s1 error");
        int replacements = countFaults(n, logs);
        System.out.println(replacements);
    }
}
