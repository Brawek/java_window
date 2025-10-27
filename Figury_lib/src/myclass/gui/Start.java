package myclass.gui;

import java.awt.*;

public class Start extends Frame {
    private Button btAdd;
    private Button btDel;
    private Button btInfo;
    private Choice chShape;
    private MenuBar menuBar;
    private MenuBar mBase;
    private MenuItem itemNew;
    private MenuItem itemRead;
    private MenuItem itemSave;
    private MenuItem itemClose;

    public Start(String title) throws HeadlessException {
        super(title);
        setSize(400, 500);
        setVisible(true);
    }
}
