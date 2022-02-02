package solver;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class MyLinkedListTest {

    private MyLinkedList myLinkedList;

    @Test
    public void test1() {
        myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1, 2);
        AssertionsForInterfaceTypes.assertThat(myLinkedList.get(1)).isEqualTo(2);
        myLinkedList.deleteAtIndex(1);
        AssertionsForInterfaceTypes.assertThat(myLinkedList.get(1)).isEqualTo(3);
    }

    @Test
    public void test2() {
        myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(4);
        AssertionsForInterfaceTypes.assertThat(myLinkedList.get(1)).isEqualTo(-1);
        myLinkedList.addAtHead(1);
        myLinkedList.addAtHead(5);
        myLinkedList.deleteAtIndex(3);
        myLinkedList.addAtHead(5);
        AssertionsForInterfaceTypes.assertThat(myLinkedList.get(3)).isEqualTo(4);
        AssertionsForInterfaceTypes.assertThat(myLinkedList.get(3)).isEqualTo(4);
        AssertionsForInterfaceTypes.assertThat(myLinkedList.get(3)).isEqualTo(4);
    }
}
