package us.erlang.recyclerview;

import java.util.ArrayList;
import java.util.List;

public class Data {
    public static final int TYPE_ITEM = 0;
    public static final int TYPE_HEADER = 1;

    private int type;
    private String title;
    private String description;
    private int number;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getNumber() {
        return number;
    }

    public Data(int type, String title, String description, int number) {
        this.type = type;
        this.title = title;
        this.description = description;
        this.number = number;
    }

    public static List<Data> createDataSet(int count) {
        List<Data> list = new ArrayList<Data>();
        list.add(new Data(TYPE_HEADER, "This is header", "", 0));
        for (int i = 1; i < count; i++) {
            list.add(new Data(TYPE_ITEM, String.format("Title%d", i), String.format("Description %d", i), i));
        }

        return list;
    }

    public int getType() {
        return type;
    }
}
