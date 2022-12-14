package com.perfectevoluton.solution.generictypes.subtypes;

import java.util.ArrayList;
import java.util.List;

/**
 * @name UIText generic type;
 * @author Mike Karypidis;
 * @version 1.0.0
 * @docs -
 * final result is to generate an object for nodejs server like
 * { <language><betweenCharacters><key> : <value> }
 * @example { en___label: "Hello world this is english label" }
 */
public class UIText {

    /** unique value */
    private String key;
    /** unique value */
    private String betweenCharacters;
    /** unique value */
    private String language;
    /** unique value */
    private String value;

    public UIText(String key, String betweenCharacters, String language, String value) {
        this.key = key;
        this.betweenCharacters = betweenCharacters;
        this.language = language;
        this.value = value;
    }

    static public List<UIText> generateUITexts (String key, String betweenCharacters, List<UITextGenerate> uiTextGenerates) {
        List<UIText> uiTexts = new ArrayList<>();
        for (int i = 0; i < uiTextGenerates.size(); i++) {
            uiTexts.add(new UIText(
                    key,
                    betweenCharacters,
                    uiTextGenerates.get(i).language,
                    uiTextGenerates.get(i).value
            ));
        }
        return uiTexts;
    }


    /**
     * @doc --- getters and setters;
     */

    public String getKey() {
        return key;
    }

    public String getBetweenCharacters() {
        return betweenCharacters;
    }

    public String getLanguage() {
        return language;
    }

    public String getValue() {
        return value;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setBetweenCharacters(String betweenCharacters) {
        this.betweenCharacters = betweenCharacters;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "UIText{" +
                "key='" + key + '\'' +
                ", betweenCharacters='" + betweenCharacters + '\'' +
                ", language='" + language + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
