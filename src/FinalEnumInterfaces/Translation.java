package FinalEnumInterfaces;

public enum Translation implements Description{
        SUNDAY {
            @Override
            public String getDescription(){
                return "День отдыха";
            }
        },
        MONDAY {
            @Override
            public String getDescription(){
                return "Начало рабочей недели";
            }
        },
        TUESDAY{
            @Override
            public String getDescription(){
                return "Вторник";
            }
        };

        public static void printDescriptions(){
            for(Translation day : Translation.values()){
                System.out.println(day + ": " + day.getDescription());
            }
        }
}
