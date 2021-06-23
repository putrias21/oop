package com.stefano.mazesolver;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class MazeSolverGUI extends JFrame {
    private JPanel mainPanel;
    private JLabel labelSize;
    private JTextField sizeInput;
    private JLabel labelMethod;
    private JRadioButton dfs;
    private JRadioButton bfs;
    private JButton btnRun;
    private JPanel mazePanel;

    public static int mazeSize;
    private int [][] maze =
            { {1,1,1,1,1,1,1,1,1,1,1,1,1},
                    {1,0,1,0,1,0,1,0,0,0,0,0,1},
                    {1,0,1,0,0,0,1,0,1,1,1,0,1},
                    {1,0,0,0,1,1,1,0,0,0,0,0,1},
                    {1,0,1,0,0,0,0,0,1,1,1,0,1},
                    {1,0,1,0,1,1,1,0,1,0,0,0,1},
                    {1,0,1,0,1,0,0,0,1,1,1,0,1},
                    {1,0,1,0,1,1,1,0,1,0,1,0,1},
                    {1,0,0,0,0,0,0,0,0,0,1,9,1},
                    {1,1,1,1,1,1,1,1,1,1,1,1,1}
            };
    private final List<Integer> path = new ArrayList<>();

    public MazeSolverGUI(String title) {
        super(title);
        ButtonGroup group = new ButtonGroup();
        group.add(dfs);
        group.add(bfs);
        mazePanel.setVisible(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        btnRun.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    mazeSize = Integer.parseInt(sizeInput.getText());
                    if(dfs.isSelected()) {
                        DepthFirst.searchPath(maze, 1, 1, path);
                    } else if(bfs.isSelected()) {
                        BreadthFirst.searchPath(maze, 1, 1, path);
                    }
                    setExtendedState(JFrame.MAXIMIZED_BOTH);
                    mazePanel.add(new MazeGUI(maze, path), BorderLayout.CENTER);
                    mazePanel.setVisible(true);
                    revalidate();
                    repaint();
                } catch(Error err) {
                    err.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new MazeSolverGUI("Maze Solver");
                frame.setVisible(true);
            }
        });
    }
}
