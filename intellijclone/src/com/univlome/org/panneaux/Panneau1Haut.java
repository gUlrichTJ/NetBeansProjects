/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.univlome.org.panneaux;

import com.univlome.org.fenetres.Fenetre;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author mgraciano
 */
public class Panneau1Haut extends JMenuBar {
    
    Fenetre fenetre;
    // We create the JMenus of the menu bar
    JMenu file = new JMenu("File");
    
    // Now we create the JMenuItems to put them in each JMenu
    JMenu nouveau = new JMenu("New");
    // In nouveau, there are submenus
    JMenuItem nouveauProjet = new JMenuItem("New Project");
    JMenuItem importProject = new JMenuItem("Import Project");
    JMenuItem projectFrom = new JMenuItem("Project From Version Control");
    JMenuItem importModule = new JMenuItem("Import Module");
    JMenuItem importSample = new JMenuItem("Import Sample...");
    JMenuItem javaClass = new JMenuItem("Java Class");
    JMenuItem kotlinClass = new JMenuItem("Kotlin Class/File");
    JMenuItem fileSubMenu = new JMenuItem("File");
    JMenuItem scratchFile = new JMenuItem("Scratch File   Ctrl+Alt+Shift+Insert");
    JMenuItem packageSubMenu = new JMenuItem("Package");
    JMenuItem moduleInfo = new JMenuItem("module-info.java");
    JMenuItem cmakeLists = new JMenuItem("CMakeLists.txt");
    JMenuItem dartFile = new JMenuItem("Dart File");
    JMenuItem resourceBundle = new JMenuItem("Resource Bundle");
    JMenuItem editorConfigFile = new JMenuItem("Editor Config File");



    // All this for file
    
    JMenuItem open = new JMenuItem("Open");
    JMenuItem profile = new JMenuItem("Profile or Debug APK");
    
    JMenu recent = new JMenu("Recent Projects");
        // We create JMenu items for the JMenu recent
        JMenuItem myApplication = new JMenuItem("My Application");
        JMenuItem manageProjects = new JMenuItem("Manage Projects...");
    
    JMenuItem closeP = new JMenuItem("Close Project");
    JMenuItem settings = new JMenuItem("Settings");
    JMenuItem projectStructure = new JMenuItem("Project Structure...");
    
    JMenu fileProperties = new JMenu("File Properties");
        // We create JMenuItems for fileProperties
        JMenuItem fileEncoding = new JMenuItem("File Encoding");
        JMenuItem removeBOM = new JMenuItem("Remove BOM");
        JMenuItem addBOM = new JMenuItem("Add BOM");
        JMenuItem associateWithFile = new JMenuItem("Assiciate with File Type...");
        JMenuItem makeFileReady = new JMenuItem("Make file read-only");
        
        // Another JMenu that will contain JMenuItem
        JMenu lineSeparator = new JMenu("Line Separators");
            // JMenuItems for lineSeparator
            JMenuItem crlfWindows = new JMenuItem("CRLF - Windows (\\r\\n)");
            JMenuItem lfUnix = new JMenuItem("LF - Unix and macOS (\\n)");
            JMenuItem crClassic = new JMenuItem("CR - Classic Mac OS (\\r)");


    JMenu localHistory = new JMenu("Local History");
    
        // JMenuItems for localHistory
        JMenuItem showHistory = new JMenuItem("Show History...");
        JMenuItem showHistoryForSelection = new JMenuItem("Show History for Selection...");
        JMenuItem putLabel = new JMenuItem("Put Label...");
        
    JMenuItem saveAll = new JMenuItem("Save All     Ctrl+S");
    JMenuItem reloadAll = new JMenuItem("Reload All from Disk   Ctrl+Alt+Y");
    JMenuItem repairIDE = new JMenuItem("Ripair IDE");
    JMenuItem invalidateCaches = new JMenuItem("Invalidate Caches...");
    
    JMenu manage = new JMenu("Manage IDE Settings");
        // JMenuItems for manage
        JMenuItem importSettings = new JMenuItem("Import Settings...");
        JMenuItem exportSettings = new JMenuItem("Export Settings...");
        JMenuItem restoreDefaultSettings = new JMenuItem("Restore Default Settings...");
        JMenuItem settingsSychronise = new JMenuItem("Settings Sychronise...");

    JMenu newProject = new JMenu("New Projects Setup");
    
        // JMenuItems for newProject
        JMenuItem settingsForNewProject = new JMenuItem("Settings for New Projects...");
        JMenuItem runConfiguration = new JMenuItem("Run Configuration Templates...");
        JMenuItem defaultProjectStructure = new JMenuItem("Default Project Structure...");
        
    JMenu export = new JMenu("Export");
        
        // JMenuItems for export
        JMenuItem filesOrSelection = new JMenuItem("Files or Selection to HTML...");
        JMenuItem exportToZip = new JMenuItem("Export to Zip File");
    
    JMenuItem print = new JMenuItem("Print...");
    JMenuItem powerSave = new JMenuItem("Power Save Mode");
    JMenuItem essential = new JMenuItem("Essential Hilighting");
    JMenuItem exit = new JMenuItem("Exit");
    
    // JMenu
    JMenu edit = new JMenu("Edit");
    
        // JMenuItems for edit
        JMenuItem undo = new JMenuItem("Undo            Ctrl+Z");
        JMenuItem redo = new JMenuItem("Redo      Ctrl+Shift+Z");
        JMenuItem cut = new JMenuItem("Cut              Ctrl+X");
        JMenuItem copy = new JMenuItem("Copy            Ctrl+C");
        JMenuItem copyPathReference = new JMenuItem("Copy Path/Reference...");
        
        JMenu paste = new JMenu("Paste");
    
            // JMenuItems for paste
            JMenuItem pasteSubMenu = new JMenuItem("Paste              Ctrl+V");
            JMenuItem pasteFromHistory = new JMenuItem("Paste from History...    Ctrl+Shift+V");
            JMenuItem pasteAsPlainText = new JMenuItem("Paste as Plain Text  Ctrl+Alt+Shift+V");
            
        JMenuItem delete = new JMenuItem("Delete");
        
        JMenu find = new JMenu("Find");
            
            // JMenuItems for find
            JMenuItem findSubMenu = new JMenuItem("Find             Ctrl+F");
            JMenuItem replace = new JMenuItem("Replace...           Ctrl+R");
            JMenuItem findNext = new JMenuItem("Find Next Occurence     F3");
            JMenuItem findPrevious = new JMenuItem("Find Previous Occurence     Shift+F3");
            JMenuItem selectAllOccurrences = new JMenuItem("Select All Occurrences      Ctrl+Alt+Shift+J");
            JMenuItem addSelectionForNext = new JMenuItem("Add Selection For Next Occurrence       Alt+J");
            JMenuItem unselectOccurrence = new JMenuItem("Unselect Occurrence           Alt+Shift+J");
            JMenuItem searchInSelection = new JMenuItem("Search in Selection           Ctrl+Alt+E");
            JMenuItem nextOccurrenceOfTheWord = new JMenuItem("Next Occurrence of the Word at Caret         Ctrl+F3");
            JMenuItem previousOccurenceOfTheWord = new JMenuItem("Previous Occurrence of the Word at Caret  Ctrl+Shift+F3");
            JMenuItem findInFiles = new JMenuItem("Find in Files...             Ctrl+Shift+F");
            JMenuItem replaceInFiles = new JMenuItem("Replace in Files...       Ctrl+Shift+R");
            JMenuItem searchStructurally = new JMenuItem("Search Structurally...");
            JMenuItem replaceStructurally = new JMenuItem("Replace Structurally...");
            JMenuItem evaluateJSONPath = new JMenuItem("Evaluate JSONPath Expression...");

        JMenu findUsages = new JMenu("Find Usages");
            
            // JMenuItems for findUsages
            JMenuItem findUsagesSubMenu = new JMenuItem("Find Usages            Alt+F7");
            JMenuItem findUsageSettings = new JMenuItem("Find Usages Settings...   Ctrl+Alt+Shift+7");
            JMenuItem showUsages = new JMenuItem("Show Usages           Ctrl+Alt+7");
            JMenuItem findUsagesInFile = new JMenuItem("Find Usages in File         Ctrl+F7");
            JMenuItem highlightUsageInFile = new JMenuItem("Hilight Usages in File      Ctrl+Shift+F7");
            JMenuItem nextHilightedUsage = new JMenuItem("Next Hilighted Usage");
            JMenuItem previousHilightedUsage = new JMenuItem("Previous Hilighted Usage");
            JMenuItem recentFindUsages = new JMenuItem("Recent Find Usages");
            
    JMenu view = new JMenu("View");
    JMenu navigate = new JMenu("Navigate");
    JMenu code = new JMenu("Code");
    JMenu refactor = new JMenu("Refactor");
    JMenu build = new JMenu("Build");
    JMenu run = new JMenu("Run");
    JMenu tools = new JMenu("Tools");
    JMenu vcs = new JMenu("VCS");
    JMenu window = new JMenu("Window");
    JMenu help = new JMenu("Help");

    // Constructor
    public Panneau1Haut() {
        /**
         Pour ajouter des sous-menus à un élément de menu, vous pouvez créer un 
         * autre JMenu et l'ajouter à l'élément de menu parent.
         */
        // Submenus
        nouveau.add(nouveauProjet);
        nouveau.add(importProject);
        nouveau.add(projectFrom);
        nouveau.add(importModule);
        nouveau.add(importSample);
        nouveau.add(javaClass);
        nouveau.add(kotlinClass);
        nouveau.add(fileSubMenu);
        nouveau.add(scratchFile);
        nouveau.add(packageSubMenu);
        nouveau.add(moduleInfo);
        nouveau.add(cmakeLists);
        nouveau.add(dartFile);
        nouveau.add(resourceBundle);
        nouveau.add(editorConfigFile);
        
        // We add the jmenuItems to the file JMenu
        file.add(nouveau);  
        file.add(open);
        file.add(profile); 
        
        // In recent, we add its subMenus
        recent.add(myApplication);
        recent.add(manageProjects);
        
        file.add(recent);
        file.add(closeP);   
        file.add(settings);
        file.add(projectStructure);
        
            // We add JMenuItems to the fileProperties
            fileProperties.add(fileEncoding);
            fileProperties.add(removeBOM);
            fileProperties.add(addBOM);
            fileProperties.add(associateWithFile);
            fileProperties.add(makeFileReady);
                // JMenuItems for lineSeparator
                lineSeparator.add(crlfWindows);
                lineSeparator.add(lfUnix);
                lineSeparator.add(crClassic);
                
            fileProperties.add(lineSeparator);
        
        file.add(fileProperties);
        
            // We add JMenuItems in localHistory
            localHistory.add(showHistory);
            localHistory.add(showHistoryForSelection);
            localHistory.add(putLabel);
        
        file.add(localHistory);
        file.add(saveAll);  
        file.add(reloadAll);
        file.add(repairIDE);
        file.add(invalidateCaches);
        
            // We add the JMenuItems of manage
            manage.add(importSettings);
            manage.add(exportSettings);
            manage.add(restoreDefaultSettings);
            manage.add(settingsSychronise);
        
        file.add(manage);
        
            // We add the JMenuItems in newProject
            newProject.add(settingsForNewProject);
            newProject.add(runConfiguration);
            newProject.add(defaultProjectStructure);
        
        file.add(newProject);
            
            export.add(filesOrSelection);
            export.add(exportToZip);
        
        file.add(export);   
        file.add(print);
        file.add(powerSave);
        file.add(essential);
        
            // Nous ajoutons une actions sur le bouton exit
            exit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Nous fermons la fenetre lorsqu'on clique sur le bouton exit
                    fenetre.dispose();
                }
            });
        
        file.add(exit);
        
        // We add fileMenuBar to the JMenuBar
        this.add(file);
        
            // We add JMenuItems to edit
            edit.add(undo);
            edit.add(redo);
            edit.add(cut);
            edit.add(copy);
            edit.add(copyPathReference);
            
                // We add JMenuItems to paste
                paste.add(pasteSubMenu);
                paste.add(pasteFromHistory);
                paste.add(pasteAsPlainText);
                
            edit.add(paste);
            edit.add(delete);
                
                // We add the JMenuItems to the find
                find.add(findSubMenu);
                find.add(replace);
                find.add(findNext);
                find.add(findPrevious);
                find.add(selectAllOccurrences);
                find.add(addSelectionForNext);
                find.add(unselectOccurrence);
                find.add(searchInSelection);
                find.add(nextOccurrenceOfTheWord);
                find.add(previousOccurenceOfTheWord);
                find.add(findInFiles);
                find.add(replaceInFiles);
                find.add(searchStructurally);
                find.add(replaceStructurally);
                find.add(evaluateJSONPath);
            
            edit.add(find);
            
                // JMenuItems for findUsages
                findUsages.add(findUsagesSubMenu);
                findUsages.add(findUsageSettings);
                findUsages.add(showUsages);
                findUsages.add(findUsagesInFile);
                findUsages.add(highlightUsageInFile);
                findUsages.add(nextHilightedUsage);
                findUsages.add(previousHilightedUsage);
                findUsages.add(recentFindUsages);
            
            edit.add(findUsages);
            
        this.add(edit);
        this.add(navigate);
        this.add(code);
        this.add(refactor);
        this.add(build);
        this.add(run);
        this.add(tools);
        this.add(vcs);
        this.add(help);
    }

}
