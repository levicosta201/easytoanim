# EasyToAnim


[![API](https://img.shields.io/badge/API-14%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=14)

## Dependency

**Step 1:** Add [Jitpack](https://jitpack.io) repository in your root build.gradle file (not your module build.gradle file):

```
allprojects {
    repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}
```


**Step 2:** Add dependency to your module's build.gradle file:

```
dependencies {
    compile 'com.github.levicosta201:easytoanim:c3c51421d3'
}
```

## Usage

Add anim to element:

```java
    
	INT_ANIM:
		SLIDE_TO_DOWN,
		FADE_IN,
		FADE_OUT
		
	animTextView(Context, INT_ANIM, TextView);
	animEditText(Context, INT_ANIM, EditText);
	animImageView(Context, INT_ANIM, ImageView);
	animButton(Context, INT_ANIM, Button);
	
```
