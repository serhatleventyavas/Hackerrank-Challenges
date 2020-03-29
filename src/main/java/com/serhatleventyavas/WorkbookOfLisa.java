package com.serhatleventyavas;

public class WorkbookOfLisa {
    public int workbook(int numberOfChapter, int maximumNumberOfProblemPerPage, int[] numberOfProblemEachChapter) {
        int specialProblemsSize = 0;
        int page = 1;

        for (int numberOfProblem: numberOfProblemEachChapter) {
            int totalPage = numberOfProblem / maximumNumberOfProblemPerPage;
            int remainingProblems = numberOfProblem % maximumNumberOfProblemPerPage;
            if (remainingProblems > 0) {
                totalPage = totalPage + 1;
            }

            int startProblemOfPage = 1;

            int chapterPage = 1;
            for (int i = 0; i < totalPage; i++) {

                //
                int numberOfProblemsOfCurrentPage = chapterPage * maximumNumberOfProblemPerPage;
                if (numberOfProblem < numberOfProblemsOfCurrentPage) {
                    numberOfProblemsOfCurrentPage = numberOfProblem;
                }
                if (page >= startProblemOfPage && page <= numberOfProblemsOfCurrentPage) {
                    specialProblemsSize = specialProblemsSize + 1;
                }
                startProblemOfPage = startProblemOfPage + maximumNumberOfProblemPerPage;
                page = page + 1;
                chapterPage = chapterPage + 1;
            }
        }

        return specialProblemsSize;
    }
}
