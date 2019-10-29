package cn.wuaijing.bean;

public class BlogImage {
    private int page;
    private String name;
    private String url;



    public BlogImage() {
    }

    public BlogImage(int page, String name, String url) {
        this.page = page;
        this.name = name;
        this.url = url;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "BlogImage{" +
                "page=" + page +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
