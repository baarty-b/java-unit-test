@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    assertEquals("Ожидалось, что для пользователя старше 18 лет метод checkIsAdult вернёт true", true, isAdult);
    assertTrue("Если пользователю больше 18, то вернется true", isAdult);
}
