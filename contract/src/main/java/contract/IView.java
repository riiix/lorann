package contract;

/**
 * The Interface IView.
 *
 * @author Jean-Aymeric Diet
 */
public interface IView {

	void setController(IController controller);

	void repaint();

	int getHeight();

	int getWidth();
}
