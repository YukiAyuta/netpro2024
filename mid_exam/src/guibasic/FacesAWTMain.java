package mid_exam.src.guibasic;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FacesAWTMain {

    public static void main(String[] args) {
        new FacesAWTMain();
    }

    FacesAWTMain() {
        FaceFrame f = new FaceFrame();
        f.setSize(800, 800);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setVisible(true);
    }

    // インナークラスを定義
    class FaceFrame extends Frame {

        private int w;
        private int h;
        private int xStart;
        private int yStart;
        // private FaceObj fobj1;
        private FaceObj[] fobjs;

        FaceFrame() {
            // fobj1= new FaceObj();
            fobjs = new FaceObj[9];
        }

        public void paint(Graphics g) {
            // この中には、g.drawLine というのは入ってこない
            // Graphicsクラス(型のようなもの---今は--)のgという変数はメソッドに渡す
            w = 200;
            h = 200;
            xStart = 50;
            yStart = 50;

            // FaceObj fobj= new FaceObj();
            // fobj.drawRim();
            FaceObj[] fobjs = new FaceObj[9];
            for (int j = 0; j < 3; j++) {
                for (int i = 0; i < 3; i++) {
                    fobjs[i + 3 * j] = new FaceObj();
                    fobjs[i + 3 * j].setPosition(200 * i + 50, 200 * j + 50, w, h);
                    fobjs[i + 3 * j].setEmotionLevel(i, j);
                    fobjs[i + 3 * j].drawFace(g);
                }
            }

            //g.fillRoundRect(xStart + 5, yStart + 5, w - 10, h - 10, 40, 40);
            // g.setColor(Color.ORANGE);
            // Color color = new Color(255, 123, 24, 56);
            // g.setColor(color);
        }

    }// FaceFrame end

    // Faceクラスを作ってみよう。
    private class FaceObj {
        private int xStart;
        private int yStart;
        private int w;
        private int h;
        private int emotionX;
        private int emotionY;
        
        public void setPosition(int xStart0, int yStart0, int w, int h) {
            this.xStart = xStart0;
            this.yStart = yStart0;
            this.w = w;
            this.h = h;
        }

        public void setEmotionLevel(int emotionX, int emotionY) {
            this.emotionX = emotionX;
            this.emotionY = emotionY;
        }

        public void drawFace(Graphics g) {
            drawRim(g);
            drawBrow(g, 15);
            drawEye(g, 35);
            drawNose(g, 40);
            drawMouth(g, 100);
            //g.fillRoundRect(xStart + 5, yStart + 5, w - 10, h - 10, 40, 40);
        }
        
        public void drawRim(Graphics g) { // wが横幅、hが縦幅
            g.drawLine(xStart, yStart, xStart + w, yStart);
            g.drawLine(xStart, yStart, xStart, yStart + h);
            g.drawLine(xStart, yStart + h, xStart + w, yStart + h);
            g.drawLine(xStart + w, yStart, xStart + w, yStart + h);

        }

        public void drawBrow(Graphics g, int updown) { // xは目の幅 呼ばれる方(=定義する方)
            int wx1 = xStart + w * 2 / 8;
            int wx2 = xStart + w * 5 / 8;
            int wy = yStart + h / 5;
            g.drawLine(wx1 - emotionX * 10, wy + updown - emotionY * 10, wx1 + w * 1 / 8 + emotionX * 10, wy + emotionY * 10);
            g.drawLine(wx2 - emotionX * 10, wy + emotionY * 10, wx2 + w * 1 / 8 + emotionX * 10, wy + updown - emotionY * 10);
        }

        public void drawNose(Graphics g, int nx) { // xは鼻の長さ
            int xMiddle = xStart + w / 2;
            int yMiddle = yStart + h /2;
            g.drawLine(xMiddle, yMiddle, xMiddle, yMiddle + nx);
        }

        public void drawEye(Graphics g, int r) { // rは目の半径
            g.drawOval(xStart + 45, yStart + 65, r, r);
            g.drawOval(xStart + w - 85, yStart + 65, r, r);

        }

        public void drawMouth(Graphics g, int mx) { // xは口の幅
            int xMiddle = xStart + w / 2;
            int yMiddle = yStart + h - 30;
            g.drawLine(xMiddle - mx / 2, yMiddle, xMiddle + mx / 2, yMiddle);
        }
    }

}// Faces class end
