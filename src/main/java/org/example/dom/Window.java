package org.example.dom;

public class Window {
    private boolean isOpen;

    public Window(boolean b) {
        this.isOpen = false;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
    public void closeWindow(){
        if(isOpen){
            setOpen(false);
        }
    }

    @Override
    public String toString() {
        return
                "okno jest otwarte:" + isOpen;


    }
}
