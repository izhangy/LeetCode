package date.firstweek.day4;

import javax.management.ListenerNotFoundException;
import java.util.List;

/**
 * @author When all else is lost the future still remains.
 * @date 2021/6/3 - 9:02
 **/
//合并有序列表
public class day4 {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode last = head;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                last.next = l2;
                l2 = l2.next;
            } else {
                last.next = l1;
                l1 = l1.next;
            }
            last = last.next;
        }
        if (l1 != null) last.next = l1;
        if (l2 != null) last.next = l2;
        return head.next;
    }
}
