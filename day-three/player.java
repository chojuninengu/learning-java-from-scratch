public class player {
    public static void sayTeam(String[] args) {
        System.out.println("Real madrid");
        
    }
    public static void sayName(String[] args) {
        System.out.println("kunga Derick Abongho");
        
    }
    public static void sayAge(String[] args) {
        System.out.println("21");
        
    }
    public static void sayScore(String[] args) {
        System.out.println(25);
        
    }
    public static void  sayRank(String[] args) {
        System.out.println("Amazing for a young individual");
    }

}

public class Test {
    public static void main(String[] args) {
        Team myTeam = new Team();
        Member member = myTeam.getMember();

        System.out.println(member.getName());
        System.out.println(member.getAge());
    }
}

public class Team {
    private Member member;

    public Team() {
        this.member = new Member();
    }

    public Member getMember() {
        return this.member;
    }
}

public class Member {
    private String name;
    private int age;
    private String className;

    public Member() {
        this.name = "";
        this.age = 0;
        this.className = "";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return this.className;
    }

    public void setClassName(String className) {
        this.className = className;
        }
}


