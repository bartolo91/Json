package pl.kurs;


//{
//        "version": 1,
//        "type": "rich",
//        "provider_name": "SoundCloud",
//        "provider_url": "https://soundcloud.com",
//        "height": 400,
//        "width": "100%",
//        "title": "Flickermood by Forss",
//        "description": "From the Soulhack album,&nbsp;recently featured in this ad <a href=\"https://www.dswshoes.com/tv_commercial.jsp?m=october2007\">https://www.dswshoes.com/tv_commercial.jsp?m=october2007</a> ",
//        "thumbnail_url": "https://i1.sndcdn.com/artworks-000067273316-smsiqx-t500x500.jpg",
//        "html": "<iframe width=\"100%\" height=\"400\" scrolling=\"no\" frameborder=\"no\" src=\"https://w.soundcloud.com/player/?visual=true&url=https%3A%2F%2Fapi.soundcloud.com%2Ftracks%2F293&show_artwork=true\"></iframe>",
//        "author_name": "Forss",
//        "author_url": "https://soundcloud.com/forss"
//        }
public class Book {

    private int version;
    private  String type;
    private  String providerName;
    private  String providerUrl;
    private  int height;
    private  int width;
    private  String title;
    private  String description;
    private  String thumbnauilUrl;
    private  String html;
    private  String authorName;
    private  String authorUrl;

    public Book(){}

    public Book(int version, String type, String providerName, String providerUrl, int height, int width, String title, String description, String thumbnauilUrl, String html, String authorName, String authorUrl) {
        this.version = version;
        this.type = type;
        this.providerName = providerName;
        this.providerUrl = providerUrl;
        this.height = height;
        this.width = width;
        this.title = title;
        this.description = description;
        this.thumbnauilUrl = thumbnauilUrl;
        this.html = html;
        this.authorName = authorName;
        this.authorUrl = authorUrl;
    }

    public int getVersion() {
        return version;
    }

    public String getType() {
        return type;
    }

    public String getProviderName() {
        return providerName;
    }

    public String getProviderUrl() {
        return providerUrl;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getThumbnauilUrl() {
        return thumbnauilUrl;
    }

    public String getHtml() {
        return html;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorUrl() {
        return authorUrl;
    }

    @Override
    public String toString() {
        return "Book{" +
                "version=" + version +
                ", type='" + type + '\'' +
                ", providerName='" + providerName + '\'' +
                ", providerUrl='" + providerUrl + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", thumbnauilUrl='" + thumbnauilUrl + '\'' +
                ", html='" + html + '\'' +
                ", authorName='" + authorName + '\'' +
                ", authorUrl='" + authorUrl + '\'' +
                '}';
    }
}
