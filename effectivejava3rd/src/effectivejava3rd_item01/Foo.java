package effectivejava3rd_item01;

import java.util.EnumSet;


public class Foo {

    String name;

    String address;

    public Foo() {
    }

    private static final Foo GOOD_NIGHT = new Foo();

    public Foo(String name) {
        this.name = name;
    }

    public static Foo withName(String name) {
        return new Foo(name);
    }

    public static Foo withAddress(String address) {
        Foo foo = new Foo();
        foo.address = address;
        return foo;
    }

    public static Foo getFoo() {
        return GOOD_NIGHT;
    }

    public static Foo getFoo(boolean flag) {
        Foo foo = new Foo();

        // TODO � Ư�� ��� �Ǿ� �ִ� �ؽ�Ʈ ���Ͽ��� Foo�� ����ü�� FQCN �� �о�´�.
        // TODO FQCN �� �ش��ϴ� �ν��Ͻ��� �����Ѵ�.
        // TODO foo ������ �ش� �ν��Ͻ��� ����Ű���� �����Ѵ�.

        return foo;
    }

    public static void main(String[] args) {
        Foo foo = new Foo("keesun");

        Foo foo1 = Foo.withName("keesun");

        Foo foo2 = Foo.getFoo();

        Foo foo3 = Foo.getFoo(false);

        EnumSet<Color> colors = EnumSet.allOf(Color.class);

        
    }

    enum Color {
        RED, BLUE, WHITE
    }

    // private static method�� �ʿ��� ����
    public static void doSomething() {
        // TODO û�Ҹ� �Ѵ�.
        // TODO �ֵ��̶� ����ش�.
        // TODO ���� ��ӿ� ����.
        �������ϰ��ܴ�();
    }

    public static void doSomethingTomorrow() {
        // TODO �ֵ� ������ �����忡 ����.
        // TODO ���� �Դ´�.
        �������ϰ��ܴ�();
    }

    private static void �������ϰ��ܴ�() {
        // TODO ������ �Ѵ�.
        // TODO �ܴ�.
    }

}