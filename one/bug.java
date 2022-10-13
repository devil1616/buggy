public class WidgetService {
    final WidgetDao dao;

    public WidgetService(WidgetDao dao) {
        this.dao = dao;
    }

    public void createWidget(Widget widget) {
        //misc business logic, for example, validating widget is valid
        //...

        dao.saveWidget(widget);
    }
}