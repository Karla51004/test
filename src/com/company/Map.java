package com.company;

import java.util.Arrays;

public class Map {

    Player myPlayer = new Player();

    private int[][] fields = {
            {
                    2, 2, 2, 2, 2, 2, 2, 2, 2, 2
            },
            {
                    2, 0, 0, 0, 0, 0, 0, 0, 0, 2
            },
            {
                    2, 0, 0, 0, 0, 0, 0, 0, 0, 2
            },
            {
                    2, 0, 0, 0, 0, 0, 0, 0, 0, 2
            },
            {
                    2, 0, 0, 0, 0, 0, 0, 0, 0, 2
            },
            {
                    2, 0, 0, 0, 0, 0, 0, 0, 0, 2
            },
            {
                    2, 0, 0, 0, 0, 0, 0, 0, 0, 2
            },
            {
                    2, 0, 0, 0, 0, 0, 0, 0, 0, 2
            },
            {
                    2, 0, 0, 0, 0, 0, 0, 0, 0, 2
            },
            {
                    2, 0, 0, 0, 0, 0, 0, 0, 0, 2
            },
            {
                    2, 2, 2, 2, 2, 2, 2, 2, 2, 2
            }
    };

    public void setFields(int[][] fields) {
        this.fields = fields;
    }

    public void putPlayer() {
        fields[myPlayer.getY()][myPlayer.getX()] = 1;
        showMap();
    }

    public void showMap() {
        for (int[] field : fields) {
            System.out.println(Arrays.toString(field));
        }
    }

    public void movePlayer(Direction direction) throws WrongDirectionException {
        switch (direction) {
            case TOP -> {
                if (fields[myPlayer.getY() - 1][myPlayer.getX()] == 0) {
                    fields[myPlayer.getY() - 1][myPlayer.getX()] = 1;
                    fields[myPlayer.getY()][myPlayer.getX()] = 2;
                    myPlayer.setY(myPlayer.getY()-1);

                }else {
                    throw new WrongDirectionException();
                }
            }
            case BOTTOM -> {
                if (fields[myPlayer.getY() + 1][myPlayer.getX()] == 0) {
                    fields[myPlayer.getY() + 1][myPlayer.getX()] = 1;
                    fields[myPlayer.getY()][myPlayer.getX()] = 2;
                    myPlayer.setY(myPlayer.getY()+1);
                }else {
                    throw new WrongDirectionException();
                }

            }
            case LEFT -> {
                if (fields[myPlayer.getY()][myPlayer.getX() - 1] == 0) {
                    fields[myPlayer.getY()][myPlayer.getX() - 1] = 1;
                    fields[myPlayer.getY()][myPlayer.getX()] = 2;
                    myPlayer.setX(myPlayer.getX()-1);
                }else {
                    throw new WrongDirectionException();
                }

            }
            case RIGHT -> {
                if (fields[myPlayer.getY()][myPlayer.getX()+1] == 0) {
                    fields[myPlayer.getY()][myPlayer.getX()+1] = 1;
                    fields[myPlayer.getY()][myPlayer.getX()] = 2;
                    myPlayer.setX(myPlayer.getX()+1);
                }else {
                    throw new WrongDirectionException();
                }

            }
            default -> {
                throw new WrongDirectionException();
            }
        }
    }
}
