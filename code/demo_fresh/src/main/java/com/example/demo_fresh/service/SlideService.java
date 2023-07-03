package com.example.demo_fresh.service;

import com.example.demo_fresh.bean.Slide;


import java.util.List;

public interface SlideService {
    List<Slide> getSlides(int type);
}
