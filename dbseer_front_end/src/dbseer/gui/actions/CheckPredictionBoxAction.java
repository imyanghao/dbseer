package dbseer.gui.actions;

import dbseer.gui.panel.DBSeerPredictionControlPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by dyoon on 2014. 6. 9..
 */
public class CheckPredictionBoxAction extends AbstractAction
{
	private String name;

	public CheckPredictionBoxAction(String name)
	{
		super(name);
		this.name = name;
	}

	@Override
	public void actionPerformed(ActionEvent actionEvent)
	{
		Object source = actionEvent.getSource();
		if (source instanceof JCheckBox)
		{
			JCheckBox box = (JCheckBox)source;
			if (box.isSelected())
			{
				DBSeerPredictionControlPanel.predictionSet.add(box.getText());
			}
			else
			{
				DBSeerPredictionControlPanel.predictionSet.remove(box.getText());
			}
		}
	}
}