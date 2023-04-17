package br.com.moises.music.modelo;

public class Audio {
    private String titulo;
    private int duracao;
    private int totalDeReproducoes;
    private int curtidas;

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    private int classificacao;
    private int quantidadeDeNotas;




    public void exibeFicha(){
        System.out.println(getTitulo());
        totalCurtidas();
        System.out.println("esta musica foi reproduzida " + totalDeReproducoes +" vezes.");
        System.out.println("tem " + getDuracao() + " minutos de duraçao");
        estrelas();

    }
    public void totalCurtidas(){
        System.out.println("esta musica foi curtida " + curtidas+ " vezes");
    }


    public void curtir (int curtir){
        curtidas += curtir;
            }
    public void reproduzir(int reproduzir){
        totalDeReproducoes+= reproduzir;

    }
    public void notas (double nota){
        quantidadeDeNotas ++;
        classificacao += nota;
        this.classificacao=classificacao/quantidadeDeNotas;
    }
    public void estrelas(){
        if (classificacao >= 10){
            System.out.println("classificacao ⭐⭐⭐⭐⭐");
        } else if(classificacao <=9 && classificacao >=7){
            System.out.println("classificacao ⭐⭐⭐⭐");
        }else if(classificacao <=6 && classificacao >= 4){
            System.out.println("classificacao ⭐⭐⭐");
        }else if(classificacao <= 3 && classificacao >= 2){
            System.out.println("classificacao ⭐⭐");
        }else if(classificacao == 1){
            System.out.println("classificacao ⭐");
        }else{
            System.out.println("esta musica nao recebeu nenhuma classificacao");
        }
    }



    public String getTitulo() {

        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }


}
