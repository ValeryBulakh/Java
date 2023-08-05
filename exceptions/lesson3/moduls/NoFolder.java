package lesson3.moduls;

import java.io.File;
import java.io.IOException;

public class NoFolder extends IOException {
    public NoFolder(){
        super("Папки 'data' небыло, я ее уже создал, повторите операцию.");
    }
}