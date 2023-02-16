package Class23;

public class Student {

    public void attendClasses() {
        System.out.println("attending classes");
    }

    void doHomework() {
        System.out.println("do your homework");
    }

    void listenTeacher() {
        System.out.println("listening a teacher");
    }
}
    class SyntaxStudents extends Student {

        @java.lang.Override
        public void attendClasses() {
            super.attendClasses();
            System.out.println("attending syntax classes");
        }

        @java.lang.Override
        public void doHomework() {
            super.doHomework();
            System.out.println("doing homework");
        }


        @java.lang.Override
        public void listenTeacher() {
            System.out.println("listening Ashgar carefully");

        }
    }

       class CollegeStudents extends Student {
            @java.lang.Override
            public void attendClasses() {
                super.attendClasses();
                System.out.println("attending classes in college");
            }

            @java.lang.Override
            public void doHomework() {
                super.doHomework();
                System.out.println("always practice");
            }


            @java.lang.Override
            public void listenTeacher() {
                super.listenTeacher();
                System.out.println("listening the programm");
            }
        }
    }
}





