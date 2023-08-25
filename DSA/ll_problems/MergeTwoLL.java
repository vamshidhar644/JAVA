package ll_problems;

class ListNodeA {
    int val;
    ListNodeA next;

    ListNodeA(int val) {
        this.val = val;
    }
}

class ListNodeB {
    int val;
    ListNodeB next;

    ListNodeB(int val) {
        this.val = val;
    }
}

public class MergeTwoLL {
    public static void printLinkedList(ListNodeA headA, ListNodeB headB) {
        ListNodeA currentA = headA;
        ListNodeB currentB = headB;

        System.out.print("List A: ");
        while (currentA != null) {
            System.out.print(currentA.val);
            if (currentA.next != null) {
                System.out.print(" ");
            }
            currentA = currentA.next;
        }

        System.out.print("\nList B: "); // Print a newline at the end
        while (currentB != null) {
            System.out.print(currentB.val);
            if (currentB.next != null) {
                System.out.print(" ");
            }
            currentB = currentB.next;
        }
    }

    public static ListNodeA mergeSort(ListNodeA head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNodeA middle = getMiddle(head);
        ListNodeA nextMiddle = middle.next;

        middle.next = null;

        ListNodeA left = mergeSort(head);
        ListNodeA right = mergeSort(nextMiddle);

        ListNodeA sortedList = merge(left, right);

        return sortedList;
    }

    public static ListNodeA getMiddle(ListNodeA head) {
        ListNodeA slow = head, fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static ListNodeA merge(ListNodeA left, ListNodeA right) {
        ListNodeA dummy = new ListNodeA(-1);
        ListNodeA curr = dummy;

        while (left != null && right != null) {
            if (left.val <= right.val) {
                curr.next = left;
                left = left.next;
            } else {
                curr.next = new ListNodeA(right.val);
                right = right.next;
            }

            curr = curr.next;
        }

        if (left != null) {
            curr.next = left;
        }
        if (right != null) {
            curr.next = new ListNodeA(right.val);
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNodeA headA = new ListNodeA(3);
        headA.next = new ListNodeA(2);
        headA.next.next = new ListNodeA(4);
        headA.next.next.next = new ListNodeA(9);

        ListNodeB headB = new ListNodeB(6);
        headB.next = new ListNodeB(1);
        headB.next.next = new ListNodeB(7);
        headB.next.next.next = new ListNodeB(2);

        printLinkedList(headA, headB);

        // ListNodeA merged = merge(headA, headB);

        // ListNodeA merged = mergeSort(headA, headB);

        // System.out.println();
        // while (merged != null) {
        //     System.out.print(merged.val + " ");
        //     merged = merged.next;
        // }
    }
}
