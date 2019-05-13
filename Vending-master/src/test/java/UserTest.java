import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

@Test
    public void initUser(){
    User user = new User();
    user.getMoney();
    assertThat(user.getMoney(), is(0));
}

@Test
    public void test_insertMoney(){
    User user = new User();

    user.inputMoney(1000);
    assertThat(user.getMoney(), is(1000));
}

@Test
    public void test_changeMoney(){
    User user = new User();
    VendingMachine drink = new VendingMachine();
    user.inputMoney(2000);
    assertThat(user.getMoney(), is(2000));
    user.change(drink.sodar.getPrice());
    assertThat(user.getMoney(), is(1000));
}

@Test(expected = IllegalArgumentException.class)
    public void test_Nomoney(){
    User user = new User();
    VendingMachine drink = new VendingMachine();
    user.inputMoney(500);
    user.change(drink.coke.getPrice());
    assertThat(user.getMoney(), is(-500));
}

@Test(expected = IllegalArgumentException.class)
    public void test_getDrink(){
        User user = new User();
        VendingMachine drink = new VendingMachine();
        user.inputMoney(1000);
        user.change(drink.sodar.getPrice());
        assertThat(user.getMoney(),is(0));
    }

    @Test
    public void test_doublePick(){
        User user = new User();
        VendingMachine drink = new VendingMachine();
        user.inputMoney(2000);
        user.change(drink.coke.getPrice());
        user.change(drink.sodar.getPrice());
        assertThat(user.getMoney(),is(0));
    }
}