package com.example.balancegame.dto;

import lombok.*;

import java.io.Serializable;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StatisticsDto implements Serializable {
    private Long catalogId;
    private int choice;
    private CatalogDto catalog;
    private int result1;
    private int result2;
    private int result3;
    private int result4;
    private int result5;
    private int result6;
    private int result7;
    private int result8;
    private int result9;
    private int result10;
    private int result11;
    private int result12;
    private int result13;
    private int result14;
    private int result15;
    private int result16;

    public int getChoice() {
        return choice;
    }

    public CatalogDto getCatalog() {
        return catalog;
    }

    public int getResult1() {
        return result1;
    }

    public int getResult2() {
        return result2;
    }

    public int getResult3() {
        return result3;
    }

    public int getResult4() {
        return result4;
    }

    public int getResult5() {
        return result5;
    }

    public int getResult6() {
        return result6;
    }

    public int getResult7() {
        return result7;
    }

    public int getResult8() {
        return result8;
    }

    public int getResult9() {
        return result9;
    }

    public int getResult10() {
        return result10;
    }

    public int getResult11() {
        return result11;
    }

    public int getResult12() {
        return result12;
    }

    public int getResult13() {
        return result13;
    }

    public int getResult14() {
        return result14;
    }

    public int getResult15() {
        return result15;
    }

    public int getResult16() {
        return result16;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public void setCatalog(CatalogDto catalog) {
        this.catalog = catalog;
    }

    public void setResult1(int result1) {
        this.result1 = result1;
    }

    public void setResult2(int result2) {
        this.result2 = result2;
    }

    public void setResult3(int result3) {
        this.result3 = result3;
    }

    public void setResult4(int result4) {
        this.result4 = result4;
    }

    public void setResult5(int result5) {
        this.result5 = result5;
    }

    public void setResult6(int result6) {
        this.result6 = result6;
    }

    public void setResult7(int result7) {
        this.result7 = result7;
    }

    public void setResult8(int result8) {
        this.result8 = result8;
    }

    public void setResult9(int result9) {
        this.result9 = result9;
    }

    public void setResult10(int result10) {
        this.result10 = result10;
    }

    public void setResult11(int result11) {
        this.result11 = result11;
    }

    public void setResult12(int result12) {
        this.result12 = result12;
    }

    public void setResult13(int result13) {
        this.result13 = result13;
    }

    public void setResult14(int result14) {
        this.result14 = result14;
    }

    public void setResult15(int result15) {
        this.result15 = result15;
    }

    public void setResult16(int result16) {
        this.result16 = result16;
    }
}
