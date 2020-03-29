package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class DesignerPdfViewerTest {

    private DesignerPdfViewer SUT;

    @BeforeEach
    public void setup() {
        SUT = new DesignerPdfViewer();
    }

    @Test
    public void designerPdfViewer_testCase1() {
        int result = SUT.designerPdfViewer(new int[] { 1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7 }, "zaba");
        assertThat(result, is(28));
    }

}