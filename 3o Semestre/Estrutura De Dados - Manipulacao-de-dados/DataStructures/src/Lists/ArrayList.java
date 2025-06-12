package Lists;

public class ArrayList<E> extends StaticList<E> {

    private void recreateArray(){
        E[] newList = (E[]) new Object[list.length*2];
        for (int i = 0; i < size; i++) {
            newList[i] = list[i];
        }
        list = newList;
    }
    public ArrayList(){
        list = (E[]) new Object[MaxSize];
    }

    @Override
    public void add(E value){
        if(isFull()) recreateArray();
        list[size++] = value;
    }

    @Override
    public void insert(E value) {
        if(isFull()) recreateArray();
        super.insert(value);
    }

    @Override
    public void insert(int index, E value) {
        if(isFull()) recreateArray();
        if(index ==0){
            insert(value);
        } else if (index >= size) {
            add(value);
        }
        else{
            for (int i = size; i> index ; i--) {
                list[i] = list[i - 1];
            }
            list[index] = value;
            size++;
        }
    }
}
