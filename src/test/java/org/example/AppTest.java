package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class JunitTests {

 @Test
 void TestSolveBrackets() {
     assertAll( () ->assertEquals("Последовательность верная! ([])[]()(([]))" ,App.SolveBrackets("([])[]()(([]))")),
                () ->assertEquals("Добавьте открывающие скобки!" ,App.SolveBrackets("([)]")),
                () ->assertEquals("Последовательность верная! {{}}([][])" ,App.SolveBrackets("{{}}([][])")),
                () ->assertEquals("Добавьте открывающие скобки!" ,App.SolveBrackets("{{{[][][])))")),
                () ->assertEquals("Добавьте закрывающие скобки!" ,App.SolveBrackets("(((((((((((()")),
                () ->assertEquals("Добавьте открывающие скобки!" ,App.SolveBrackets(")))))))))))}}]"))
     );

 }

}
