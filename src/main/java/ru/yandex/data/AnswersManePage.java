package ru.yandex.data;


public enum AnswersManePage {

    FirstAnswer("Сутки — 400 рублей. Оплата курьеру — наличными или картой.", 0),

    SecondAnswer("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, " +
            "можете просто сделать несколько заказов — один за другим.", 1),

    ThirdAnswer("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. " +
            "Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы " +
            "привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.", 2),

    FourthAnswer("Только начиная с завтрашнего дня. Но скоро станем расторопнее.", 3),

    FifthAnswer("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому" +
            " номеру 1010.", 4),

    SixthAnswer("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — " +
            "даже если будете кататься без передышек и во сне. Зарядка не понадобится.", 5),

    SeventhAnswer("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже" +
            " не попросим. Все же свои.", 6),

    EighthAnswer("Да, обязательно. Всем самокатов! И Москве, и Московской области.", 7);

    private String answer;
    private Integer numberQuestions;

    public String getAnswer() {
        return answer;
    }

    public Integer getNumberQuestions() {
        return numberQuestions;
    }

    AnswersManePage(String answer, Integer numberQuestions) {
        this.answer = answer;
        this.numberQuestions = numberQuestions;
    }
}
