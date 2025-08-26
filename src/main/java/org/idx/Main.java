package org.idx;

import org.idx.data.DataManager;
import org.idx.data.InjectData;
import org.idx.window.Window;

public class Main {

    public static final DataManager dataManager = new DataManager("data.json");

    public static void main(String[] args) {

        InjectData.injectData();
        dataManager.save();

        Window window = new Window();

    }
}