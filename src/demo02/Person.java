package demo02;

public class Person implements Comparable<Person> {
    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int  age;
//重写排序的规则
    @Override
    public int compareTo(Person o) {
//        return 0;//认为元素都是相同的
        //自定义比较的规则，比较两个人的年龄(this,参数Person)
        return  this.getAge()-o.getAge();//年龄升序排序
//        return  o.getAge()-this.getAge();//年龄降序排序
        

    }
}
