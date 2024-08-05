package com.adomasda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Lightable {
    boolean lightIsOn();
}

class LightableList {
    List<Lightable> lightables = Arrays.asList(); // TODO: add lightable elements
}