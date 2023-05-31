@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    assertEquals("Должно вернуться true, так как пользователь совершеннолетний", true, isAdult);
}

@Test
public void checkIsAdultWhenAgeIsLessThan18False() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(17);
    assertEquals("Ожидалось, что для пользователя младше 18 лет метод checkIsAdult вернёт false", false, isAdult);
    assertFalse("Пользователь младше 18 лет не должен быть совершеннолетним", isAdult);
}

@Test
public void checkIsAdultWhenAgeIs18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(18);
    assertEquals("Ожидалось, что для пользователя в возрасте 18 лет метод checkIsAdult вернёт true", true, isAdult);
    assertTrue("Пользователь в возрасте 18 лет должен быть совершеннолетним", isAdult);
}
