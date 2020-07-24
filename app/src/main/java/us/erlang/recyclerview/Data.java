package us.erlang.recyclerview;

import java.util.ArrayList;
import java.util.List;

public class Data {
    public String title;
    public String description;
    public int number;

    public Data(String title, String description, int number) {
        this.title = title;
        this.description = description;
        this.number = number;
    }

    public static List<Data> createDataSet(int count) {
        List<Data> list = new ArrayList<Data>();
        for (int i = 0; i < count; i++) {
            list.add(new Data(String.format("Title%d", i), String.format("Description %d", i), i));
        }

        return list;
    }
}
