package Exc_8;

    class BoundedWaitList<E> extends WaitList<E>{
        private int capacity;
        public BoundedWaitList(int cap){
            super();
            capacity = cap;
        }

        public int getCapacity() {
            return capacity;
        }

        public void add (E elem){
            if(content.size()<capacity){
                content.add(elem);
            }
        }

        @Override
        public String toString() {
            return content.toString() +
                    ", capacity=" + capacity;
        }
    }


