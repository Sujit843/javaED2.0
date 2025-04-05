package Collection_Framework.Map.Internal_StructureOf_HashMap;

import java.util.Objects;

public class HashCodeAndEqual {


    static class  Person {
        private String name ;
        private int id;

        public Person (String name, int id) {
            this.name = name ;
            this.id = id;
        }
            public String getName(){
            return name;
            }
            public int getId(){
            return id;
            }

        @Override
        public boolean equals(Object obj) {
           if(this == obj){
               return true;
           }
           if( obj == null){
               return false;
           }
           if(getClass() !=obj.getClass()){
               return false;
           }
           Person other = (Person) obj;
           return id == other.getId() ;
        }

        @Override
        public String toString() {
            return super.toString();
        }

    }
}
