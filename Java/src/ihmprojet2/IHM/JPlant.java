package ihmprojet2.IHM;

public interface JPlant {
    public String getPlanteText();
    public void setPlanteText(String PlanteText);
    public String getFruitText();
    public void setFruitText(String PlanteText);
    public void setFruitIcon(SimulIcon icon);
    public void setPlanteIcon(SimulIcon icon);
    public enum SimulIcon {
        SANS_PLANTE,
        GRAINE,
        CACAI_MORTE,
        CACAI_VIVANTE,
        CACAI_GERMEE,
        TOMATITO_MORTE,
        TOMATITO_MORTE1,
        TOMATITO_VIVANTE,
        TOMATITO_GERMEE,
        SANS_FRUIT,
        CACAI_AMER,
        CACAI_SUCRE,
        TOMATITO_MARRON,
        TOMATITO_ROUGE,
        TOMATITO_VERT;
    }
}
