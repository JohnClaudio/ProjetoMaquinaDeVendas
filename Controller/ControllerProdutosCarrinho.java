package ProjetoMaquinaDeVendas.Controller;

import ProjetoMaquinaDeVendas.Classes.Produtos.Produto;
import java.util.ArrayList;
import java.util.List;

import ProjetoMaquinaDeVendas.Classes.CarrinhodeCompras;
public class ControllerProdutosCarrinho {

    private List<Produto> produtos = new ArrayList<Produto>();
    private CarrinhodeCompras carrinho = new CarrinhodeCompras();

   // private Produto produtos2 = new Produto();
/*
    public ControllerProdutosCarrinho() {
        //ADICIONANDO PRODUTOS PADRÕES
        this.produtos.add(new Produto("Refrigerante", 3.0, "25/10/2022", 10));
        this.produtos.add(new Produto("Chocolate", 7.0, "25/10/2021", 5));
        this.produtos.add(new Produto("Agua", 2.0, "05/05/2022", 20));
        this.produtos.add(new Produto("Energético", 5.50, "05/05/2023", 10));
        this.produtos.add(new Produto("M$M'S", 5.50, "09/09/2021", 5));
    }*/

    public void adicionandoProdutoCarrinho(int id_produto){

        this.carrinho.AdicionarProdutoCarrinho(produtos.get(id_produto));
    }
    public void removerProdutoCarrinho(int id_produto){

        this.carrinho.AdicionarProdutoCarrinho(produtos.get(id_produto));
    }
    public void mostrarProdutosdoCarrinho(){

   //     this.carrinho.mostrarItensCarrinho();
    }

        public void ApresentarCatalogoProduto()
        {

            for (int i=0; i< produtos.size(); i++)
            {
                String nomeProduto = produtos.get(i).getNome();
                //CAPTURA NOME DO OBJETO ATRAVÉS DO INDEX ONDE ESTÁ ARMAZENADO NA LISTA LISTA (COLLETION)

                Double precoProduto = produtos.get(i).getPreco();
                //CAPTURA NOME DO OBJETO ATRAVÉS DO INDEX ONDE ESTÁ ARMAZENADO NA LISTA LISTA (COLLETION)

                int id_produto = i;
                //O ID DO PRODUTO SE REFERE AO INDEX DA COLETION ONDE O OBJETO ESTÁ ARMAZENADO

                System.out.println("ID: " + id_produto + "Produto: " + nomeProduto + "Valor: " +precoProduto);
            }
      }



    }





