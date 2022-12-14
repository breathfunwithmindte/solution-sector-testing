package com.perfectevoluton.solution;

import com.perfectevoluton.solution.generictypes.subtypes.UIText;
import com.perfectevoluton.solution.generictypes.subtypes.UITextGenerate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SolutionApplication {

	public static void main(String[] args) {
		List<UIText> uitextsgenerated =  UIText.generateUITexts("something", "___", new ArrayList<UITextGenerate>(){{
			add(new UITextGenerate("en", "some label here for english"));
			add(new UITextGenerate("gr", "auta einai gia ellinika"));
		}});

		for (int i = 0; i < uitextsgenerated.size(); i++) {
			System.out.println(uitextsgenerated.get(i).toString());
		}

		SpringApplication.run(SolutionApplication.class, args);
	}

}
