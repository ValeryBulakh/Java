package lesson3;

import lesson3.controller.CheckUser;
import lesson3.controller.ChekUser;
import lesson3.controller.SaveUsser;
import lesson3.moduls.NoFolder;
import lesson3.moduls.NumberException;
import lesson3.moduls.User;
import lesson3.view.View;

import java.io.*;
import java.net.URI;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.APPEND;

public class Main {
    public static void main(String[] args) throws NoFolder {
        View view = new View();
        view.start();

    }
}