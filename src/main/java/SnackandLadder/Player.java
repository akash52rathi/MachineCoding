package SnackandLadder;

import lombok.*;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Player {


    private String name;
    @Generated
    private int id;
    private int Postion;
    private boolean winner;
}
