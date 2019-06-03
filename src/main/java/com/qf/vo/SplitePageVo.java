package com.qf.vo;

public class SplitePageVo {
    public int start;
    public int pageSize;

    @Override
    public String toString() {
        return "SplitePageVo{" +
                "start=" + start +
                ", pageSize=" + pageSize +
                '}';
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
