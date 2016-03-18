package Tentamen;

/**
 * Created by jonatan on 2016-03-18.
 */
public class Member {
        private String name;
        private int id;
        public Member(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return this.name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getId() {
            return this.id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String toString() {
            return this.name + ", " + this.id;
        }
    }
