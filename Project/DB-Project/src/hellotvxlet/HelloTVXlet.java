package hellotvxlet;

import javax.tv.xlet.*;
import org.dvb.ui.*;
import java.awt.*;
import org.havi.ui.*;
import java.awt.event.*;
import org.havi.ui.event.*;


public class HelloTVXlet implements Xlet, HActionListener {
    private XletContext actueleXletContext;
    private HScene scene;
    private boolean debug=true;
    private HStaticText tekstLabel;
    private HStaticText tekstLabelM;
    
    //TITLESCREEN
    private HStaticText titelLabel;
    private String titelString;
    
    
    public void actionPerformed(ActionEvent e){
        
        titelString = e.getActionCommand();
        System.out.println(titelString);
        
        if(titelString == "startQuiz"){
            System.out.println("DANSEEEEN");
        }
        else
        {
            System.out.println("Geen feestje sorry");
        }
        
        
        
        
    
    }
    
    
    
    private HTextButton knop1, knop2;

    
    
    public void displayTitleScreen(){
        
        HSceneTemplate sceneTemplate = new HSceneTemplate();
        
        //Grootte en positie
        sceneTemplate.setPreference(HSceneTemplate.SCENE_SCREEN_DIMENSION, new HScreenDimension(1.0f, 1.0f), HSceneTemplate.REQUIRED);
        sceneTemplate.setPreference(HSceneTemplate.SCENE_SCREEN_LOCATION, new HScreenPoint(0.0f, 0.0f), HSceneTemplate.REQUIRED);
        
        scene = HSceneFactory.getInstance().getBestScene(sceneTemplate);
        
        titelLabel = new HStaticText("Welkom bij de quiz");
        titelLabel.setLocation(100,-100);
        titelLabel.setSize(400,250);
        
        scene.add(titelLabel);
        
            
            knop1 = new HTextButton("START");
            knop1.setLocation(100,100);
            knop1.setSize(100,50);
            knop1.setBackground(new DVBColor(0,0,0,179));
            knop1.setBackgroundMode(HVisible.BACKGROUND_FILL);
            
        
        
            knop2 = new HTextButton("EXIT");
            knop2.setLocation(100,200);
            knop2.setSize(100,50);
            knop2.setBackground(new DVBColor(0,0,0,179));
            knop2.setBackgroundMode(HVisible.BACKGROUND_FILL);
            
            knop1.setFocusTraversal(null, knop2, null, null); // Op, neer, links, rechts
            knop2.setFocusTraversal(knop1, null, null, null);
            
        
            scene.add(knop1);
            scene.add(knop2);
        
            knop1.requestFocus();
            
            knop1.setActionCommand("startQuiz");
            knop2.setActionCommand("exitQuiz");
            
            knop1.addHActionListener(this);
            knop2.addHActionListener(this);
        
            
        
    }
    
    

    public void initXlet(XletContext context) throws XletStateChangeException {
        if(debug) System.out.println("Xlet initialiseren");
        this.actueleXletContext = context;
        //Template aanmaken
        displayTitleScreen();
       /* HSceneTemplate sceneTemplate = new HSceneTemplate();
        
        //Grootte en positie
        sceneTemplate.setPreference(HSceneTemplate.SCENE_SCREEN_DIMENSION, new HScreenDimension(1.0f, 1.0f), HSceneTemplate.REQUIRED);
        sceneTemplate.setPreference(HSceneTemplate.SCENE_SCREEN_LOCATION, new HScreenPoint(0.0f, 0.0f), HSceneTemplate.REQUIRED);
        
        scene = HSceneFactory.getInstance().getBestScene(sceneTemplate);
            
            knop1 = new HTextButton("KNOP1");
            knop1.setLocation(100,100);
            knop1.setSize(100,50);
            knop1.setBackground(new DVBColor(0,0,0,179));
            knop1.setBackgroundMode(HVisible.BACKGROUND_FILL);
            
        
        
            knop2 = new HTextButton("KNOP2");
            knop2.setLocation(100,200);
            knop2.setSize(100,50);
            knop2.setBackground(new DVBColor(0,0,0,179));
            knop2.setBackgroundMode(HVisible.BACKGROUND_FILL);
            
        knop1.setFocusTraversal(null, knop2, null, null); // Op, neer, links, rechts
        knop2.setFocusTraversal(knop1, null, null, null);
            
        
        scene.add(knop1);
        scene.add(knop2);
        
        knop1.requestFocus();
        
        knop1.setActionCommand("knop1_actioned");
        knop2.setActionCommand("knop2_actioned");
        knop1.setActionCommand("knop1_actioned");
        knop2.setActionCommand("knop2_actioned");
        
       
        
        
        
        
   
        tekstLabelM = new HStaticText("Wie wordt er multimilionair?");
        tekstLabelM.setLocation(100,-100);
        tekstLabelM.setSize(400,250);
        
        scene.add(tekstLabelM);
        
        
        
        
        tekstLabel = new HStaticText("");
        
        tekstLabel.setLocation(100, 100);
        tekstLabel.setSize(400,250);
        tekstLabel.setBackground(new DVBColor(255,255,255,179));
        tekstLabel.setBackgroundMode(HVisible.BACKGROUND_FILL);
        
        scene.add(tekstLabel);
         */
        
    }

    public void startXlet() throws XletStateChangeException{
    
        if(debug) System.out.println("Xlet Starten");
        //scene zichtbaar maken
        scene.validate();
        scene.setVisible(true);
    }

    public void pauseXlet() {
     
    }

    public void destroyXlet(boolean unconditional) throws XletStateChangeException{
     
    }
}
