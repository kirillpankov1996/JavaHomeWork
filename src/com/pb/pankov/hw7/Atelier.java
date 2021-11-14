package com.pb.pankov.hw7;

public class Atelier {
    public static void main(String[] args) {
        Clothes[] clothesToDress = new Clothes[4];
        clothesToDress[0] = new Tshirt(Size.L, "черный", 100);
        clothesToDress[1] = new Pants(Size.M, "белый", 200);
        clothesToDress[2] = new Skirt(Size.M, "зеленый", 300);
        clothesToDress[3] = new Tie(Size.L, "красный", 400);

        dressWoman(clothesToDress);
        System.out.println();
        dressMan(clothesToDress);
    }

    public static void dressMan(Clothes[] clothes) {
        System.out.println("Мужская одежда в наличии:");

        for (Clothes nextPiece: clothes) {
            if (nextPiece instanceof MenClothes) {
                ((MenClothes)nextPiece).dressMan();
            }
        }
    }

    public static void dressWoman(Clothes[] clothes) {
        System.out.println("Женская одежда в наличии:");

        for (Clothes nextPiece: clothes) {
            if (nextPiece instanceof WomenClothes) {
                ((WomenClothes)nextPiece).dressWoman();
            }
        }
    }
}
