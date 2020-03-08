package ru.job4j.condition;

 class DummyBot {
     public static void main(String[] args) {
        ???
     }
     public  String answer(final String question) {
         final String result;
         if (question.equals("Привет, Бот.")) {
             result = "Привет, умник.";
         } else if (question.equals("Пока.")) {
             result = "До скорой встречи.";
         } else {
             result = "Это ставит меня в тупик. Спросите другой вопрос.";
         }
         return result;
     }
 }