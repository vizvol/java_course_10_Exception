public class User {

    private String login;

    public User() {

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) throws LoginException {
        char s = containsDigitOrChar(login);
        if ( s != '-')
            throw new LoginException("Ошибка! строка содержит" + ( Character.isDigit(s) ? " цифру: " : " 3 раза подряд букву: ") + s, login);
        this.login = login;
    }

    // метод распознавания символов в строке
    public static char containsDigitOrChar (String str){
        int i = 0;
        int count = 0;
        char tempS = '-';
        for (char s : str.toCharArray() ) {
            if (count == 2) return tempS;
            if (Character.isDigit(s) ) {
                return s;
            }
            if ( i > 0 && tempS == s && Character.isLetter(s) ) {
                count += 1;
                //System.out.println("tempS = " + tempS + " s = " + s + " i = " + i + " count = " + count);
            }
            else count = 0;
            tempS = s;
            i++;
        }
        return '-';
    }
}

