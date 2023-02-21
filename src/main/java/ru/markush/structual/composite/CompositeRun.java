package ru.markush.structual.composite;

import java.io.IOException;
import java.util.List;

public class CompositeRun {
    public static void main(String[] args) throws IOException {
        Item root = new Dir(
                List.of(
                        new ImageFile("1"),
                        new ImageFile("2"),
                        new ImageFile("3"),
                        new ImageFile("4"),
                        new ImageFile("5"),
                        new Dir(
                                List.of(
                                        new ImageFile("6"),
                                        new ImageFile("7"),
                                        new Dir(
                                                List.of(
                                                        new ImageFile("8"),
                                                        new ImageFile("9")
                                                )
                                        )
                                )
                        )
                )
        );
        System.out.println(root);
    }
}
