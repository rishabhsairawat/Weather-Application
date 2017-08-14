package AppPackage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import sairawat.weather.WeatherDisplay;
import sairawat.weather.WeatherDoc;

public class AppGUI extends javax.swing.JFrame {
    public AppGUI() throws IOException {
        initComponents();
        getWeather();
    }
    

    private void getWeather() throws IOException{
    WeatherDoc doc =new WeatherDoc("29059308","c");
    WeatherDisplay disp=new WeatherDisplay();
    CityLabel.setText(disp.getCity());
    CountryLabel.setText(disp.getCountry());
    ConditionLabel.setText(disp.getCondition());
    TemperatureLabel.setText(disp.getTemperature()+"° "+disp.getTemperatureUnit());
    SunriseLabel.setText("Sunrise: "+disp.getSunrise());
    SunsetLabel.setText("Sunset: "+disp.getSunset());
    ChillLabel.setText("Chill: "+disp.getWindChill());
    DirectionLabel.setText("Direction: "+disp.getWindDirection());
    SpeedLabel.setText("Speed: "+disp.getWindSpeed()+" "+disp.getSpeedUnit());
    VisibilityLabel.setText("Visibility: "+disp.getVisibility()+" "+disp.getDistanceUnit());
    HumidityLabel.setText("Humidity: "+disp.getHumidity()+" %");
    PressureLabel.setText("Pressure: "+disp.getPressure()+" "+disp.getPressureUnit());
    String x;
    x=disp.getConditionCode();
    switch(x)
    {
        case "0": ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\0.PNG"));
                    break;
        case "1":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\1.PNG"));
                    break;
        case "2":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\1.PNG"));
                    break;
        case "3":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\Cloudy Night With Thunderstorm1.PNG"));
                    break;
        case "4":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\Cloudy Night With Thunderstorm1.PNG"));
                    break;
        case "5":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\Hailstorm.PNG"));
                    break;
        case "6":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\Hailstorm.PNG"));
                    break;
        case "7":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\Hailstorm.PNG"));
                    break;
        case "8":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\Showers Night.PNG"));
                    break;
        case "9":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\Showers Night.PNG"));
                    break;
        case "10":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\Heavy Rainfall.PNG"));
                    break;
        case "11":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\Heavy Rainfall.PNG"));
                    break;
        case "12":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\Heavy Rainfall.PNG"));
                    break;
        case "13":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\Hailstorm.PNG"));
                    break;
        case "14":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\Hailstorm.PNG"));
                    break;
        case "15":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\Hailstorm.PNG"));
                    break;
        case "16":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\Hailstorm.PNG"));
                    break;
        case "17":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\Hailstorm.PNG"));
                    break;
        case "18":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\Hailstorm.PNG"));
                    break;
        case "19":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\42.PNG"));
                    break;
        case "20":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\clouds.PNG"));
                    break;
        case "21":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\clouds.PNG"));
                    break;
        case "22":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\clouds.PNG"));
                    break;
        case "23":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\clouds.PNG"));
                    break;
        case "24":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\clouds.PNG"));
                    break;
        case "25":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\clouds.PNG"));
                    break;
        case "26":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\clouds.PNG"));
                    break;
        case "27":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\Cloudy Night.PNG"));
                    break;
        case "28": ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\Cloudy Day.PNG"));
                    break;
        case "29":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\Partly cloudy Night.PNG"));
                    break;
        case "30":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\Partly Cloudy Day.PNG"));
                    break;
        case "31":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\ClearNight.PNG"));
                    break;
        case "32":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\Sunny Day.PNG"));
                    break;
        case "33":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\ClearNight.PNG"));
                    break;
        case "34":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\Sunny Day.PNG"));
                    break;
        case "35":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\Heavy Rainfall.PNG"));
                    break;
        case "36":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\34.PNG"));
                    break;
        case "37":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\Cloudy Night With Thunderstorm1.PNG"));
                    break;
        case "38":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\Cloudy Night With Thunderstorm1.PNG"));
                    break;
        case "39":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\Cloudy Night With Thunderstorm1.PNG"));
                    break;
        case "40":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\Showers Day.PNG"));
                    break;
        case "41":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\Hailstorm.PNG"));
                    break;
        case "42":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\Hailstorm.PNG"));
                    break;
        case "43":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\Hailstorm.PNG"));
                    break;
        case "44":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\Cloudy Night With Thunderstorm1.PNG"));
                    break;
        case "45":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\Cloudy Night With Thunderstorm1.PNG"));
                    break;
        case "46":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\Hailstorm.PNG"));
                    break;
        case "47":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\Rain.PNG"));
                    break;
        case "3200":ImageLabel.setIcon(new ImageIcon("C:\\Users\\Rishabh Sairawat\\Documents\\NetBeansProjects\\WeatherApplication\\src\\Images\\Not Available.PNG"));
                    break;

    }
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGPanel = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        AstronomyPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        SunriseLabel = new javax.swing.JLabel();
        SunsetLabel = new javax.swing.JLabel();
        WindPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        DirectionLabel = new javax.swing.JLabel();
        SpeedLabel = new javax.swing.JLabel();
        ChillLabel = new javax.swing.JLabel();
        TemperaturePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TemperatureLabel = new javax.swing.JLabel();
        LocationPanel = new javax.swing.JPanel();
        CityLabel = new javax.swing.JLabel();
        CountryLabel = new javax.swing.JLabel();
        AtmospherePanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        HumidityLabel = new javax.swing.JLabel();
        VisibilityLabel = new javax.swing.JLabel();
        PressureLabel = new javax.swing.JLabel();
        ConditionPanel = new javax.swing.JPanel();
        ImageLabel = new javax.swing.JLabel();
        ConditionLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Weather Apllication Project");
        setBackground(new java.awt.Color(255, 102, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(255, 51, 51));
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BGPanel.setBackground(new java.awt.Color(255, 204, 0));
        BGPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 7));
        BGPanel.setPreferredSize(new java.awt.Dimension(960, 600));

        Title.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        Title.setLabelFor(Title);
        Title.setText("Weather Application");
        Title.setToolTipText("");

        AstronomyPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 7));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setText("Astronomy:");

        SunriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SunriseLabel.setForeground(new java.awt.Color(51, 0, 51));

        SunsetLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SunsetLabel.setForeground(new java.awt.Color(51, 0, 51));

        javax.swing.GroupLayout AstronomyPanelLayout = new javax.swing.GroupLayout(AstronomyPanel);
        AstronomyPanel.setLayout(AstronomyPanelLayout);
        AstronomyPanelLayout.setHorizontalGroup(
            AstronomyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AstronomyPanelLayout.createSequentialGroup()
                .addGroup(AstronomyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AstronomyPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(AstronomyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SunsetLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(SunriseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(AstronomyPanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        AstronomyPanelLayout.setVerticalGroup(
            AstronomyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AstronomyPanelLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(20, 20, 20)
                .addComponent(SunriseLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SunsetLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        AstronomyPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {SunriseLabel, SunsetLabel});

        WindPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 7));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel4.setText("Wind:");

        DirectionLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DirectionLabel.setForeground(new java.awt.Color(51, 0, 51));

        SpeedLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SpeedLabel.setForeground(new java.awt.Color(51, 0, 51));

        ChillLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ChillLabel.setForeground(new java.awt.Color(51, 0, 51));

        javax.swing.GroupLayout WindPanelLayout = new javax.swing.GroupLayout(WindPanel);
        WindPanel.setLayout(WindPanelLayout);
        WindPanelLayout.setHorizontalGroup(
            WindPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WindPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(WindPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DirectionLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SpeedLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(WindPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(137, Short.MAX_VALUE))
                    .addComponent(ChillLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        WindPanelLayout.setVerticalGroup(
            WindPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WindPanelLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ChillLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SpeedLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DirectionLabel)
                .addGap(51, 51, 51))
        );

        TemperaturePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 7));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setText("Temperature:");

        TemperatureLabel.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        TemperatureLabel.setForeground(new java.awt.Color(51, 0, 51));

        javax.swing.GroupLayout TemperaturePanelLayout = new javax.swing.GroupLayout(TemperaturePanel);
        TemperaturePanel.setLayout(TemperaturePanelLayout);
        TemperaturePanelLayout.setHorizontalGroup(
            TemperaturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TemperaturePanelLayout.createSequentialGroup()
                .addGroup(TemperaturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TemperaturePanelLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(TemperatureLabel))
                    .addGroup(TemperaturePanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        TemperaturePanelLayout.setVerticalGroup(
            TemperaturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TemperaturePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(TemperatureLabel)
                .addGap(21, 21, 21))
        );

        LocationPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 7));

        CityLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CityLabel.setForeground(new java.awt.Color(51, 0, 51));

        CountryLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CountryLabel.setForeground(new java.awt.Color(51, 0, 51));

        javax.swing.GroupLayout LocationPanelLayout = new javax.swing.GroupLayout(LocationPanel);
        LocationPanel.setLayout(LocationPanelLayout);
        LocationPanelLayout.setHorizontalGroup(
            LocationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LocationPanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(LocationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CountryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(CityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        LocationPanelLayout.setVerticalGroup(
            LocationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LocationPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CountryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        AtmospherePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 7));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setText("Atmosphere:");

        HumidityLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        HumidityLabel.setForeground(new java.awt.Color(51, 0, 51));

        VisibilityLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        VisibilityLabel.setForeground(new java.awt.Color(51, 0, 51));

        PressureLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PressureLabel.setForeground(new java.awt.Color(51, 0, 51));

        javax.swing.GroupLayout AtmospherePanelLayout = new javax.swing.GroupLayout(AtmospherePanel);
        AtmospherePanel.setLayout(AtmospherePanelLayout);
        AtmospherePanelLayout.setHorizontalGroup(
            AtmospherePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AtmospherePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AtmospherePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(VisibilityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HumidityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PressureLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        AtmospherePanelLayout.setVerticalGroup(
            AtmospherePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AtmospherePanelLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HumidityLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VisibilityLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PressureLabel)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        ConditionPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 7));

        ConditionLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ConditionLabel.setForeground(new java.awt.Color(51, 0, 51));

        javax.swing.GroupLayout ConditionPanelLayout = new javax.swing.GroupLayout(ConditionPanel);
        ConditionPanel.setLayout(ConditionPanelLayout);
        ConditionPanelLayout.setHorizontalGroup(
            ConditionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConditionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ConditionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ConditionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ImageLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        ConditionPanelLayout.setVerticalGroup(
            ConditionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConditionPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConditionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout BGPanelLayout = new javax.swing.GroupLayout(BGPanel);
        BGPanel.setLayout(BGPanelLayout);
        BGPanelLayout.setHorizontalGroup(
            BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
            .addGroup(BGPanelLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LocationPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AstronomyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(WindPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConditionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGPanelLayout.createSequentialGroup()
                        .addComponent(TemperaturePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGPanelLayout.createSequentialGroup()
                        .addComponent(AtmospherePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))))
        );
        BGPanelLayout.setVerticalGroup(
            BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGPanelLayout.createSequentialGroup()
                .addComponent(Title)
                .addGroup(BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGPanelLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(LocationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BGPanelLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(TemperaturePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BGPanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(ConditionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(66, 66, 66)
                .addGroup(BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AtmospherePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WindPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AstronomyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 105, Short.MAX_VALUE))
        );

        getContentPane().add(BGPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new AppGUI().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(AppGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AstronomyPanel;
    private javax.swing.JPanel AtmospherePanel;
    private javax.swing.JPanel BGPanel;
    private javax.swing.JLabel ChillLabel;
    private javax.swing.JLabel CityLabel;
    private javax.swing.JLabel ConditionLabel;
    private javax.swing.JPanel ConditionPanel;
    private javax.swing.JLabel CountryLabel;
    private javax.swing.JLabel DirectionLabel;
    private javax.swing.JLabel HumidityLabel;
    private javax.swing.JLabel ImageLabel;
    private javax.swing.JPanel LocationPanel;
    private javax.swing.JLabel PressureLabel;
    private javax.swing.JLabel SpeedLabel;
    private javax.swing.JLabel SunriseLabel;
    private javax.swing.JLabel SunsetLabel;
    private javax.swing.JLabel TemperatureLabel;
    private javax.swing.JPanel TemperaturePanel;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel VisibilityLabel;
    private javax.swing.JPanel WindPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
