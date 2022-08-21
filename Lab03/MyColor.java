public class MyColor implements ColorsADT{
    private static ColorsEnum color;

    public MyColor (ColorsEnum s){
        color = s;
    }

    public static ColorsEnum getMyColor(){
        return color;
    }

    @Override
    public ColorsEnum mix(ColorsEnum color1, ColorsEnum color2) {
        ColorsEnum smixColor;
        smixColor = ColorsEnum.RED;
        if (color1 == ColorsEnum.RED) {
            if (color2 == ColorsEnum.YELLOW) {
                smixColor = ColorsEnum.ORANGE;
            } else if (color2 == ColorsEnum.BLUE) {
                smixColor = ColorsEnum.VIOLET;
            }
        } else if (color1 == ColorsEnum.YELLOW) {
            if (color2 == ColorsEnum.RED) {
                smixColor = ColorsEnum.ORANGE;
            } else if (color2 == ColorsEnum.BLUE) {
                smixColor = ColorsEnum.GREEN;
            }
        } else if (color1 == ColorsEnum.BLUE) {
            if (color2 == ColorsEnum.RED) {
                smixColor = ColorsEnum.VIOLET;
            } else if (color2 == ColorsEnum.YELLOW) {
                smixColor = ColorsEnum.GREEN;
            }
        }
        return smixColor;
    }

    @Override
    public boolean primary(ColorsEnum color1) {
        if(color1 == ColorsEnum.RED || color1 == ColorsEnum.YELLOW || color1 == ColorsEnum.BLUE)
            return true;
        else
            return false;
    }

    @Override
    public ColorsEnum[] form(ColorsEnum color1) {
        ColorsEnum[] colorsEnums = new ColorsEnum[2];
        if(color1 == ColorsEnum.GREEN) {
            colorsEnums[0] = ColorsEnum.BLUE;
            colorsEnums[1] = ColorsEnum.YELLOW;
        } else if(color1 == ColorsEnum.VIOLET) {
            colorsEnums[0] = ColorsEnum.RED;
            colorsEnums[1] = ColorsEnum.BLUE;
        } else if(color1 == ColorsEnum.ORANGE) {
            colorsEnums[0] = ColorsEnum.RED;
            colorsEnums[1] = ColorsEnum.YELLOW;
        }
        return colorsEnums;
    }

    @Override
    public ColorsEnum assign(ColorsEnum color2) {
        color = color2;
        return color;
    }
} 