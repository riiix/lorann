package contract;

/**
 * The Interface IController.
 *
 * @author Jean-Aymeric Diet
 */
public interface IController {

	/**
	 * Control.
	 */
	void start();

	/**
	 * Order perform.
	 *
	 * @param controllerOrder
	 *          the controller order
	 */
	void orderPerform(ControllerOrder controllerOrder);

	IElement[][] getTileMap();

	int getScore();
    int getLevel();

	IElement[][] parser(String tilemap);
}
